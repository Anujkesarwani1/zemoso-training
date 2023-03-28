import React from 'react'
import CheckboxComponent from '.'
import { ComponentMeta, ComponentStory } from '@storybook/react'

export default {
    title: 'atoms/Checkbox',
    component: CheckboxComponent,
} as ComponentMeta<typeof CheckboxComponent>;

const Template: ComponentStory<typeof CheckboxComponent> = (args) => (
    <CheckboxComponent {...args}/>
)

export const checkbox = Template.bind({});
checkbox.args = {}

