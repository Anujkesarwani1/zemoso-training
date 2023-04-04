import {
  Button,
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Paper,
  Container,
  Divider,
  styled,
} from "@mui/material";
import { Link } from "react-router-dom";
import { candidateData } from "../data/candidateData";


const MuiTable = styled(Table)({
  minWidth: 650,
});

const MuiTableCell = styled(TableCell)({
  fontWeight: "bold",
});

const MuiTableRow = styled(TableRow)({
  "&:last-child td, &:last-child th": { border: 0 },
});

const MuiLink = styled(Link)({
  textDecoration: 'none',
});

const MuiButton = styled(Button)({
  fontWeight: 'bold',
})

interface Props {
  setSharedName: (newValue: string) => void;
}

export default function CandidateList({ setSharedName }: Props) {
  return (
    <Paper component={Container}>
      <h1>Candidate Information</h1>
      <Divider />
      <TableContainer>
        <MuiTable size="small" aria-label="simple table">
          <TableHead>
            <TableRow>
              <MuiTableCell>NAME</MuiTableCell>
              <MuiTableCell>ADJUDICATION</MuiTableCell>
              <MuiTableCell>STATUS</MuiTableCell>
              <MuiTableCell>LOCATION</MuiTableCell>
              <MuiTableCell>DATE</MuiTableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {candidateData.map((row) => (
              <MuiTableRow key={row.name} >
                <TableCell component="th" scope="row">
                  <MuiLink
                    to="/candidateInfo"
                    onClick={() => setSharedName(row.name)} >
                    {row.name}
                  </MuiLink>
                </TableCell>
                <TableCell>
                  <MuiButton size="small" color="success" >
                    {row.adjudication}
                  </MuiButton>
                </TableCell>
                <TableCell>{row.status}</TableCell>
                <TableCell>{row.location}</TableCell>
                <TableCell>{row.date}</TableCell>
              </MuiTableRow>
            ))}
          </TableBody>
        </MuiTable>
      </TableContainer>
    </Paper>
  );
}

