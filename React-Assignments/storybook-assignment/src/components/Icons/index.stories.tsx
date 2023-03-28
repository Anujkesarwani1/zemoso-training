import React from 'react'
import IconComponent from '.'
import { ComponentMeta, ComponentStory } from '@storybook/react'

export default {
    title: 'atoms/Icon',
    component: IconComponent,
} as ComponentMeta<typeof IconComponent>;

const Template: ComponentStory<typeof IconComponent> = (args) => <IconComponent />

export const icon = Template.bind({});
icon.args = {}

