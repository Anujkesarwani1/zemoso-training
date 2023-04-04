import { Grid, Container, Typography, Paper, Button, Box, styled } from '@mui/material';
import ArrowBackIcon from '@mui/icons-material/ArrowBack';
import CandidateDetails from './candidateDetails';
import CourtSearch from './courtSearch';
import { Link } from 'react-router-dom';
import { updateAdjudication } from '../data/candidateData';

const MuiContainer = styled(Container)({
    paddingTop: '1rem',
});

const MuiGrid = styled(Grid)({
    paddingBottom: '2rem',
});

const MuiButton = styled(Button)({
    marginRight: '1rem',
});

const MuiPaper = styled(Paper)({
    marginBottom: '3rem',
});

interface Props {
    sharedName: string;
    sharedAdjudication: string;
    setSharedAdjudication: (newValue: string) => void;
}

const CandidateInfo = ({ sharedName, sharedAdjudication, setSharedAdjudication }: Props) => {
    const handleEngageButton = () => {
        setSharedAdjudication('ENGAGE');
        updateAdjudication(sharedName, sharedAdjudication);
    }
    return (
        <MuiContainer>
            <MuiGrid container direction='row' spacing={1}>
                <Grid item>
                    <Link to='/' style={{ color: 'black' }}><ArrowBackIcon /></Link>
                </Grid>
                <Grid item>
                    <Typography variant='h6'> {sharedName} </Typography>
                </Grid>
                <Grid sm={10}>
                    <Box display="flex" justifyContent="flex-end">
                        <Grid item>
                            <MuiButton
                                size='small'
                                variant='contained'>
                                Pre - Adverse Action
                            </MuiButton>
                        </Grid>
                        <Grid item>
                            <Button
                                component={Link}
                                variant='contained' size='small'
                                to='/'
                                onClick={() => handleEngageButton()}>
                                Engage
                            </Button>
                        </Grid>
                    </Box>
                </Grid>
            </MuiGrid>
            <MuiPaper><CandidateDetails title='Candidate Information' /></MuiPaper>
            <MuiPaper><CandidateDetails title='Report Information' /></MuiPaper>
            <CourtSearch />
        </MuiContainer>
    );
}

export default CandidateInfo;

